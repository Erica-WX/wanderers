<template>
  <div id="app">
    <keep-alive>
      <router-view></router-view>
    </keep-alive>
  </div>
</template>

<script>
 export default{
//   name:'app',
//   data:function () {
//     return{user:{}}
//   },
//   method:{
//       saveUserInfo:function(userInfo){
//           this.user=userInfo;
//           this.global.userInfo=userInfo
//       }
//   }
 }
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0;
  padding: 0;
}
body{
  margin:0;
}
</style>
