package lesson11;

public class ExternalLoginPage extends LoginPage{

    @Override
    protected String userNameSel() {
        return "ExternalLoginPage + usernameSel";
    }

    @Override
    protected String passWordSel() {
        return "ExternalLoginPage + passWordSel";
    }

    @Override
    protected String loginBtnSel() {
        return "ExternalLoginPage + loginBtnSel";
    }
}
