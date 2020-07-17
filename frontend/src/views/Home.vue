<template>
  <el-container>
    <el-header style="margin-bottom:20px;margin-top: 10px">
    </el-header>
    <H4>Chill</H4>
    <el-carousel :interval="2000" type="card" :height="bannerHeight+'px'">
      <el-carousel-item v-for="item in imgUrls" :key="item.id" @click.native="play(item.idView)">
        <el-row>
          <el-col class="banner_img">
            <img ref="bannerHeight" :src="item.idView" class="bannerImg" @Load="imgLoad" width="180px" height="180px"/>
            <!--<img ref="bannerHeight" src="/img/img1.jpg" class="bannerImg" @Load="imgLoad" width="180px" height="180px"/>-->
          </el-col>
        </el-row>
      </el-carousel-item>
    </el-carousel>
  </el-container>
</template>


<script>

  export default {
    name: "left",
    data(){
      return {
        bannerHeight: "",
        imgUrls: [
          {id: 0, idView: '/img/img1.jpg'},
          {id: 1, idView: '/img/img1.jpg'},
          {id: 2, idView: '/img/img1.jpg'},
          {id: 3, idView: '/img/img1.jpg'},
          {id: 4, idView: '/img/img1.jpg'},
          {id: 5, idView: '/img/img1.jpg'},

        ]
      }
    },
    methods: {
      imgLoad(){
        this.$nextTick(() => {
          this.bannerHeight = this.$refs.bannerHeight[0].height;
          console.log(this.$refs.bannerHeight[0].height);
        })
      },
      play(src){
      	alert(this.$store.state.musicSrc);
        this.$store.commit('setMusicSrc','/music/遥远的歌.mp3')
      }
    },
    mounted(){
      this.imgLoad();
      window.addEventListener('resize', () => {
        this.bannerHeight = this.$refs.bannerHeight[0].height;
        this.imgLoad();
      }, false)
    },
  }
</script>

<style scoped>

  .el-carousel {
    padding: 30px;
    margin-right: 40px;
  }

  /*.el-carousel__item:nth-child(2n) {*/
  /*background-color: #99a9bf;*/
  /*}*/

  /*.el-carousel__item:nth-child(2n+1) {*/
  /*background-color: #d3dce6;*/
  /*}*/
</style>
