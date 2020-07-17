<template>
  <el-container>
    <el-header>
      歌曲详情
    </el-header>
    <el-main>
      <ul v-for="item in this.$store.state.music">
        <li>
          {{item}}
        </li>
      </ul>
      <!--歌名：Love Of My Life<br><br>-->
      <!--歌手: <a href="Details.vue">Declan Galbraith</a><br><br>-->
      <!--专辑: <a href="Details.vue">Thank You</a>-->
    </el-main>
  </el-container>
</template>

<script>
	// @ is an alias to /src


	export default {}
</script>

<style>
  .el-main{
    height: 450px;
  }
</style>
