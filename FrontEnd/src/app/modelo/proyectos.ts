export class Proyectos {
    id: number;
    nombreProyec: string;
    descProyec: string;
    imagenProyec: string;
    
    constructor(nombreProyec: string, descProyec: string, imagenProyec: string) {
        this.nombreProyec = nombreProyec;
        this.descProyec = descProyec;
        this.imagenProyec = imagenProyec;
    }
}
