public  class Persona extends Estudiante implements Evaluable{
     Float nota;
    public Persona(String nombre, String Apellido, float nota) {
        super(nombre, Apellido);
        this.nota = nota;
    }






        @Override
        public String toString() {
            return "Nombre: " + Nombre + "\nApellido:"+Apellido+ "\nNota: " + nota+"\n------------";
        }
    public boolean esAprobado() {
        return this.nota >= 10;
    }

}
