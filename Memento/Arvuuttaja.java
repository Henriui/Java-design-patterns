package Memento;

public class Arvuuttaja {
    private int arvaus;

    public Object liityPeliin() {
        arvaus = (int) (Math.random() * 5);
        System.out.println("Arvottu luku: " + arvaus);
        return new Memento(this.arvaus);

    }

    public boolean arvaa(Object obj, int asiakasArvaus) {
        Memento m = (Memento) obj;
        if (m.getArvaus() != asiakasArvaus) {
            return false;  
        }
        
        System.out.println("Oikea arvaus. arvaus: " + m.getArvaus() + " ja " + asiakasArvaus);
        return true;
    }

    private class Memento {
        private int arvaus;

        public Memento(int state) {
            this.arvaus = state;
        }

        public int getArvaus() {
            return arvaus;
        }
    }

}
