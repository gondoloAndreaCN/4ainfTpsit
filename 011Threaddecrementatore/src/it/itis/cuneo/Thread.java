package it.itis.cuneo;

public class Thread extends java.lang.Thread {

    private int cicli;
    private Principale principale;


    public Thread(Principale principale) {
        this.principale = principale;
        this.cicli = 0;
    }

    public Thread() {
    }

    public int getCicli() {
        return cicli;
    }

    public void setCicli(int cicli) {
        this.cicli = cicli;
    }

    public Principale getPrincipale() {
        return principale;
    }

    public void setPrincipale(Principale principale) {
        this.principale = principale;
    }

    public void run(){
        this.principale.getSemaforo().down();
        while(this.principale.getShm() > 0){
            this.principale.getSemaforo().up();
            this.principale.getSemaforo().down();
            if(this.principale.getShm() > 0){
                this.principale.setShm(this.principale.getShm()-1);
                System.out.println(this.principale.getShm());
                this.setCicli(this.getCicli()+1);
            }
            this.principale.getSemaforo().up();
            //System.out.println(this.principale.getShm());
            this.principale.getSemaforo().down();
        }
        this.principale.getSemaforo().up();
        /*un commento: istanza.metodo
                       this.getprincipale
                       this.principale.getsemaforo()*/

    }
}