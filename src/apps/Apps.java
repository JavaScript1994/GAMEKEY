package apps;

import vista.*;

public class Apps {
    
   public static void main(String[] args) {
        frmsplash splash = new frmsplash();
        frmprincipal main = new frmprincipal();
        
        splash.setVisible(true);
        splash.setLocationRelativeTo(null);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                if(i == 100){
                    splash.dispose();
                    main.setVisible(true);
                    main.setLocationRelativeTo(null);
                }else{
                    splash.lblporcentaje.setText(Integer.toString(i)+"%");
                    splash.jbpcarga.setValue(i);
                }
                
            }
        } catch (Exception e) {
            System.out.println("Se presento un error..."+e.getMessage());
        }
    }
    
}
