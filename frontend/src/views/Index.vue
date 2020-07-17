<template>
  <el-container>
    <el-header>
      <el-menu
        :default-active="activeIndex"
        :router="true"
        mode="horizontal"
        @select="handleSelect"
        active-text-color="#ffd04b"
      >

        <el-menu-item index="/index/home">
          <img id="myImage" src="/img/img.jpg" width="80px" height="50px" />
        </el-menu-item>
        <el-menu-item index="/index/home">Home</el-menu-item>
        <el-menu-item index="/index/stream">Stream</el-menu-item>
        <el-menu-item index="/index/library">Library</el-menu-item>
      </el-menu>

    </el-header>
    <el-container>
      <el-main :span="18">
        <router-view></router-view>
        <!--<search></search>-->
      </el-main>
      <el-aside :span="6">
        <myDetails></myDetails>
      </el-aside>
    </el-container>
    <el-container class="footer" width="100%">
      <el-footer>
        <musicPlayer class="musicPlayer"></musicPlayer>
      </el-footer>
    </el-container>
  </el-container>
</template>

<script>


  export default {
    name: 'Home',
    data(){
      return {
        activeIndex: '/index/home'
      }
    },
    components: {
      musicPlayer:require('./MusicPlayer.vue').default,
      search:require('../components/Search.vue').default,
      myDetails:require('../components/Details.vue').default,
    },
  }
</script>

<style scoped>

  .el-header {
    /*display: flex;*/
    top: 0;
    text-align: center;
    line-height: 60px;
    padding: 0;
    position: fixed;
    min-width: 100%;
    z-index: 2;
  }
  .el-footer {
    background-color: #B3C0D1;
    text-align: center;
    line-height: 60px;
    padding: 0;
    bottom: 0;
    position: fixed;
    min-width: 100%;
    z-index:2;
  }
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    /*line-height: 1000px;*/
    height: 100%;
  }

  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    /*line-height: 1000px;*/
    height: 1000px;
    padding: 0;
    overflow: hidden;
  }

  .el-menu {
    background-color: #333;
    color: #999;
    padding: 0;
  }

  .el-container {
    margin-bottom: 10px;
    /*height: 100%;*/
  }

  .el-container:first-child{
    display: flex;
    /*min-height: 100vh;*/
    flex-direction: column;
  }

  .el-container:nth-child(2){
    margin-top: 60px;
  }

  .el-container:nth-child(3){
    flex:1;
  }


  /*.el-container:nth-child(5) .el-aside,*/
  /*.el-container:nth-child(6) .el-aside {*/
  /*line-height: 260px;*/
  /*}*/

  /*.el-container:nth-child(7) .el-aside {*/
  /*line-height: 320px;*/
  /*}*/
</style>
