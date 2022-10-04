export class Educacion {
    id?: number;
    tituloEdu: string;
    fechaEdu: string;
    descEdu: string;
    
    constructor(tituloEdu: string, fechaEdu: string, descEdu: string) {

        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        
    }
}
