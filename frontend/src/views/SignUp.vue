<template>
  <el-container>
    <el-alert v-if="signFlag" type="success">您已经登录过了，{{ jumpSeconds }}后返回上一界面..</el-alert>
    <el-header style="margin-bottom:100px">
      <el-row type="flex" class="row-bg" justify="center">
        <el-col :span="6">
          <H2>注册</H2>
        </el-col>
      </el-row>
    </el-header>
    <el-row type="flex" class="row" justify="center">
      <el-col :span="8" :offset="0">
        
          <el-form 
          ref="userInfo" 
          :rules="rules" 
          style="..."
          :label-position="labelPosition" label-width="100px"
          :model="userInfo"
          >
          <el-form-item label="用户名">
            <el-input placeholder="输入用户名" v-model="userInfo.username"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <!-- <template slot="prepend" align="center" style="width: 100px">
                密 码
              </template> -->
            <el-input placeholder="输入密码" type="password" v-model="userInfo.password"></el-input>
          </el-form-item>
          <el-form-item label="再次输入密码">
            <el-input placeholder="再次输入密码" type="password" v-model="userInfo.nextPassword">
            </el-input>
          </el-form-item>
        </el-form>
        
        
        <el-row>
          <el-col :span="4" :offset="10">
            <el-button type="primary" @click="submit">注册</el-button>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    
  </el-container>
</template>

<script>
    export default {
        name: "SignUp",
        data(){
            return {
                jumpSeconds: 2,

                labelPosition: 'right',

                userInfo: {
                  username: '',
                  password: '',
                  nextPassword: '',
                },
                signUpForm:{
                    username: '',
                    password: '',
                    role:1,
                    avatarUrl:'null',
                    introduction:'null',
                    follower:0,
                    del_flag:0,
                    band:{
                        bid:1,
                    }
                }

                // signFlag: false
            }
        },
        methods: {
            submit: function () {
                // todo 1.获取input框的数据 2.通过axios提交数据

                let user = {};
                // let username = this.username;
                // let password = this.password;
                // let role = this.role;
                // let avatarUrl = this.avatarUrl;
                // let introduction = this.introduction;
                // let follower = this.follower;
                // let del_flag = this.del_flag;
                // let band = this.band;
                user.username = this.userInfo.username;
                user.password = this.userInfo.password;
                // user.role = 1;
                // user.avatarUrl = "https://xxx";
                // user.introduction = "balabala";
                // user.followerNum = 10;
                // user.delFlag = 1;
                // user.bid = 1;

                console.log(user.password);
                console.log(user.username);
                axios.post('/signUp', {
                  newUserResponse: user
                  }).then(
                    function(res){
                    console.log(res) //打印返回内容
                    this.$router.push({path: '/Login'})
                }).catch(()=>{
                    //this.signFlag = true
                    alert("SignUp failed")
                })
            }
        }
    }
</script>

<style scoped>

</style>
