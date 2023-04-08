
package supermarket;


abstract class Login {
    private String Username;
    private String password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   abstract void Logindisplay();
    
}
