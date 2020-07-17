<template>
  <el-container>
    <el-main :span="18">
      <search></search>
    </el-main>

  </el-container>
</template>

<script>
	// @ is an alias to /src


	export default {
    components:{
      search:require('../components/Search.vue').default
    }
  }
</script>
