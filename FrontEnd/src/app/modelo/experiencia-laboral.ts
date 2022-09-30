export class ExperienciaLaboral {
    id?: number;
    tituloExp: string;
    fechaExp: string;
    descExp: string;
    imagenExp: string;

    constructor(tituloExp: string, fechaExp: string, descExp: string, imagenExp: string) {
        
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }
}
