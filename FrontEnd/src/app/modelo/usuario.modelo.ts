export class usuario {
    id?: number;
    nombre: string;
    apellido: string;
    titulo: string;
    descripcion: string;
    imagenPerfil: string;

    constructor(nombre: string, apellido: string, titulo: string, descripcion: string, imagenPerfil: string) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenPerfil = imagenPerfil;
    }
}