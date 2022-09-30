import { Component, OnInit } from '@angular/core';
import { ExperienciaLaboral } from 'src/app/modelo/experiencia-laboral';
import { ExperienciaServiceService } from 'src/app/service/experiencia-service.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  expeLabo: ExperienciaLaboral[] = [];

  constructor(private experienciaService: ExperienciaServiceService, private tokenService: TokenService) { }
  isLogged = false;

  ngOnInit(): void {
    this.cargarExperienciaLaboral();
    if(this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarExperienciaLaboral(): void {
    this.experienciaService.lista().subscribe(data => {
      this.expeLabo = data;
      }
    )
  }

  delete(id?: number) {
    if(id != undefined) {
      this.experienciaService.delete(id).subscribe(data => {
        this.cargarExperienciaLaboral();
        }, err => {
          alert("no se elimino");
        }
      )
    }
  }

}

