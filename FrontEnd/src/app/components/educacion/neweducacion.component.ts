import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/modelo/educacion';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-neweducacion',
  templateUrl: './neweducacion.component.html',
  styleUrls: ['./neweducacion.component.css']
})
export class NeweducacionComponent implements OnInit {
  tituloEdu: string;
  fechaEdu: string;
  descEdu: string;
  imagenEdu: string;

  constructor(private educacionService: EducacionService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const educacion = new Educacion(this.tituloEdu, this.fechaEdu, this.descEdu, this.imagenEdu);
    this.educacionService.save(educacion).subscribe(data => {
      alert("Educacion añadida");
      this.router.navigate(['']);
    }, err => {
      alert("Fallo");
      this.router.navigate(['']);
    })
  }

}
