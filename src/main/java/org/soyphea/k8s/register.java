
@RequestMapping("/register")
public void Register(@RequestBody UserInfo user){
    try{
        database.openConnection();
        database.saveUser(User.email, user.password);
    }
    catch(Exception ex){
        throw ex;
    }
    finally{
        database.closeConnection();
    }
}
