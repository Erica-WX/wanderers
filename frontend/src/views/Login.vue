<template>
  <el-container>
    <el-header style="margin-bottom:100px">
      <el-row type="flex" class="row-bg" justify="center">
        <el-col :span="6">
          <H2>漫游者原创音乐平台</H2>
        </el-col>
      </el-row>
    </el-header>
    <el-row type="flex" class="row" justify="center">
      <el-col :span="8" :offset="0">
        <el-form ref="loginForm" :rules="rules" style="..."
                 :label-position="'right'" :model="userInfo">
          <el-form-item>
            <el-input placeholder="输入用户名" auto-complete="new-password" v-model="username">
              <template slot="prepend">
                用户名
              </template>
            </el-input>
          </el-form-item>
          <el-form-item>
            <el-input placeholder="输入密码" type="password" auto-complete="new-password" v-model="password">
              <template slot="prepend">
                &nbsp密码&nbsp&nbsp
              </template>
            </el-input>
          </el-form-item>
        </el-form>
        <el-row>
          <el-col :span="4" :offset="10">
            <el-button type="primary" @click="submit">
              登录
            </el-button>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </el-container>
</template>

<script>
  // @ is an alias to /src


  export default {
    name: 'Login4',
    data(){
      return {
        username: '',
        password: '',
//            signInForm{
//
//            }
        signFlag: false
      }
    },

    methods: {
      submit: function () {
        // todo 1.获取input框的数据 2.通过axios提交数据
        let username = this.username;
        let password = this.password;
        axios.post('/signIn', {username, password}).then(res => {
          console.log(res) //打印返回内容
          this.$router.push({path: '/index'})
        }).catch(()=>{
        	this.signFlag = true
        	alert("login failed")
        })
      }
    }
  }
</script>

<style lang="scss" scoped rel="stylesheet/scss">
  .el-row {
    margin-bottom: 20px;

  }
</style>
