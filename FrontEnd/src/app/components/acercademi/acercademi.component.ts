import { Component, OnInit } from '@angular/core';
import { usuario } from 'src/app/modelo/usuario.modelo';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-acercademi',
  templateUrl: './acercademi.component.html',
  styleUrls: ['./acercademi.component.css']
})
export class AcercademiComponent implements OnInit {
  usuario: usuario = new usuario("","","","","");

  constructor(public usuarioService: UsuarioService) { }

  ngOnInit(): void {
    this.usuarioService.getUsuario().subscribe(data =>{this.usuario = data})
  }

}
