export class ExperienciaLaboral {
    id?: number;
    tituloExp: string;
    fechaExp: string;
    descExp: string;
    
    constructor(tituloExp: string, fechaExp: string, descExp: string) {
        
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        
    }
}
