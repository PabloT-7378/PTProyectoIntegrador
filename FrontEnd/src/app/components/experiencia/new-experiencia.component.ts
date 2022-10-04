import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ExperienciaLaboral } from 'src/app/modelo/experiencia-laboral';
import { ExperienciaServiceService } from 'src/app/service/experiencia-service.service';

@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrls: ['./new-experiencia.component.css']
})
export class NewExperienciaComponent implements OnInit {
  tituloExp: string = '';
  fechaExp: string = '';
  descExp: string = '';
  
  constructor(private experienciaService: ExperienciaServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const expeLabo = new ExperienciaLaboral(this.tituloExp, this.fechaExp, this.descExp);
    this.experienciaService.save(expeLabo).subscribe(
      data => {
      alert("Experiencia añadida");
      this.router.navigate(['']);
    }, err => {
      alert("Fallo");
      this.router.navigate(['']);
    }
    )
  }

}
