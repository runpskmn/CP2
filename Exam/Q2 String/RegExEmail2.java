
import java.util.Scanner;

public class RegExEmail2 {

    static boolean isCorrect(String str) {
        boolean Correct = true;
        for (int i = 0; i < str.length(); ++i) {
            int c = str.charAt(i);
            boolean isUpper = Character.isUpperCase(c);
            boolean isLower = Character.isLowerCase(c);
            boolean isNumber = Character.isDigit(c);
            if (!isUpper && !isLower && !isNumber) {
                Correct = false;
                break;
            }
        }
        if (Correct) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isCorrect2(String str) {
        boolean Correct = true;
        for (int i = 0; i < str.length(); ++i) {
            int c = str.charAt(i);
            boolean isUpper = Character.isUpperCase(c);
            boolean isLower = Character.isLowerCase(c);
            if (!isUpper && !isLower) {
                Correct = false;
                break;
            }
        }
        if (Correct) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isCorrect3(String str) {
        boolean Correct = true;
        for (int i = 0; i < str.length(); ++i) {
            int c = str.charAt(i);
            boolean isUpper = Character.isUpperCase(c);
            boolean isLower = Character.isLowerCase(c);
            boolean isNumber = Character.isDigit(c);
            boolean dot = false;
            if(c=='.')
                dot = true;
            if (!isUpper && !isLower && !isNumber && !dot) {
                Correct = false;
                break;
            }
        }
        if (Correct) {
            return true;
        } else {
            return false;
        }
    }

    static boolean haveTopLevel(String mail) {
        if (mail.contains(".")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean haveDomain(String mail) {
        if (mail.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    public static void isTopLevel(String mail) {
        boolean Domain = haveDomain(mail);
        boolean TopLevel = haveTopLevel(mail);
        String Top = "";
        if (TopLevel) {
             int start = 0;
            int target = 0;
            while (true) {
                target = mail.indexOf(".", start);
                if (target == -1) {
                    break;
                }
                start = target + 1;
            }
            Top = mail.substring(start, mail.length());
        }
        if (!TopLevel) {
            System.out.println("top level domain name is not found");
        } else {
            boolean Correct = isCorrect2(Top);
            if (Top.isEmpty()) {
                System.out.println("top level domain name is empty");
            } else if (Top.length() < 2 || Top.length() > 3) {
                System.out.println("length of top is invalid");
            } else if (Correct) {
                System.out.println("top:" + Top);
            } else {
                System.out.println("top:" + Top + " invalid top level domain name");
            }
        }
    }

    static boolean DomainEmpty(String mail) {
        boolean haveDomain = haveDomain(mail);
        boolean haveTop = haveTopLevel(mail);
        String Domain = "";
        if (haveDomain && haveTop) {
            int start = 0;
            int target = 0;
            while (true) {
                target = mail.indexOf(".", start);
                if (target == -1) {
                    break;
                }
                start = target + 1;
            }
            Domain = mail.substring(mail.indexOf("@") + 1, start-1);
        } else if (haveDomain && !haveTop) {
            Domain = mail.substring(mail.indexOf("@") + 1, mail.length());
        }
        if (Domain.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void isDomain(String mail) {
        boolean haveDomain = haveDomain(mail);
        boolean haveTop = haveTopLevel(mail);
        String Domain = "";
        if (haveDomain && haveTop) {
            int start = 0;
            int target = 0;
            while (true) {
                target = mail.indexOf(".", start);
                if (target == -1) {
                    break;
                }
                start = target + 1;
            }
             Domain = mail.substring(mail.indexOf("@") + 1, start-1);
        } else if (haveDomain && !haveTop) {
            Domain = mail.substring(mail.indexOf("@") + 1, mail.length());
        }
        if(!haveDomain)
            System.out.println("domain name is not found");
        else{
            boolean Correct = isCorrect3(Domain);
            if(Domain.isEmpty())
                System.out.println("domain name is empty");
            else if(Correct)
                System.out.println("domain:"+Domain);
            else
                System.out.println("domain:"+Domain+" invalid domain name");
        }

    }

    public static void isUsername(String mail) {
        boolean Domain = haveDomain(mail);
        boolean Top = haveTopLevel(mail);
        String User = "";
        if (Domain) {
            User = mail.substring(0, mail.indexOf("@"));
        } else if (Top) {
            User = mail.substring(0, mail.indexOf("."));
        } else {
            User = mail;
        }
        boolean Correct = isCorrect(User);
        if (User.isEmpty()) {
            System.out.println("username is empty");
        } else if (Correct) {
            System.out.println("username:" + User);
        } else {
            System.out.println("username:" + User + " invalid username");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        isUsername(mail);
        isDomain(mail);
        if (DomainEmpty(mail) && !haveTopLevel(mail)) {

        } else if (!haveDomain(mail)) {

        } else {
            isTopLevel(mail);
        }
    }
}
