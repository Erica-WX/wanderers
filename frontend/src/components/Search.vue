<template>
  <el-container>
    <el-header>
      <el-input v-model="query.musicName" placeholder="发现你的兴趣所在" style="width:480px"></el-input>
      <el-button type="primary" @click="searchMusic">搜索</el-button>
    </el-header>
    <el-main>
      <transation
        appear
        mode="out-in"
      >
        <el-table
          :data="tableData"
          border
          stripe
        >
          <el-table-column
            prop="mscName"
            label="歌名"
          />
          <el-table-column
            prop="mscIntr"
            label="介绍"
          />
          <el-table-column label="操作">
            <template slot-scope="scope">
              <el-button
                icon="el-icon-video-play"
                size="mini"
                @click="searchByID(1)">
                <!--@click="play(scope.$index,scope.row)">-->
                播放
              </el-button>
            </template>
          </el-table-column>
        </el-table>
      </transation>
    </el-main>
    <el-footer>
      <!--分页，之后再完成-->
      <!--<el-pagination-->
      <!--:total="pageInfo.total"-->
      <!--:current-page.sync="pageInfo.Num"-->
      <!--:page-sizi="pageInfo.pageSize"-->
      <!--layout="total,prev,paper,next,jumper"-->
      <!--@current-change="handePageChange"-->
      <!--/>-->
    </el-footer>
  </el-container>
</template>

<script>

  export default {
    name: 'SearchMusic',
    data(){
      return {
        query: {
          musicName: '',
        },
        musicList: [],
        tableData: []
      }
    },
    methods: {
      searchMusic(){
        window.axios.post('/music', {}, {
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
          },
          params: {
            msc_name: this.query.musicName
          }
        }).then(res => {
          // 清空原表单数据
          console.log('old: ' + this.tableData)
          this.tableData.splice(0, this.tableData.length)
          // 加载新数据
          for (let index in res.data) {
            this.tableData.push(res.data[index])
          }

          // 给pageInfo赋值，先省略
        })
      },
      searchByID(id){
        window.axios.post('/music', {}, {
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
          },
          params: {
            msc_id: id
          }
        }).then(res => {
          console.log(res.data)
          this.$store.commit('setCurrentMusic', res.data[0])
          this.$store.commit('setMusicSrc', '/music/' + res.data[0].mscSrc)
        })
      }
    },
    play(index, row){
//        axios.get('/music/'+row.mscSrc).then(res=>{
//          console.log(res)
//        })
      this.$store.commit('setMusicSrc', '/music/' + row.mscSrc)
      let res = this.searchByID(2)
      this.$store.commit('setCurrentMusic', res)
      console.log(this.$store.state.music.mscID)

    }

  }
</script>

<style>
  .el-input {
    margin-top: 20px;
  }
</style>
