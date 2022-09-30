import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ExperienciaLaboral } from 'src/app/modelo/experiencia-laboral';
import { ExperienciaServiceService } from 'src/app/service/experiencia-service.service';

@Component({
  selector: 'app-editexperiencia',
  templateUrl: './editexperiencia.component.html',
  styleUrls: ['./editexperiencia.component.css']
})
export class EditexperienciaComponent implements OnInit {
  expeLabo : ExperienciaLaboral = null;

  constructor(private experienciaService: ExperienciaServiceService,private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.experienciaService.detail(id).subscribe(data => {
      this.expeLabo = data;
    }, err => {
      alert("Error al modificar");
      this.router.navigate(['']);
    })
  }

  onUpdate(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.experienciaService.update(id, this.expeLabo).subscribe(data => {
      this.router.navigate(['']);
    }, err => {
      alert("Error al modificar");
      this.router.navigate(['']);
    }
    )
  }

}
