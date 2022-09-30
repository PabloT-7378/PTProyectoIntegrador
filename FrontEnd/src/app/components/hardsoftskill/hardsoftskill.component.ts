import { Component, OnInit } from '@angular/core';
import { Skill } from 'src/app/modelo/skill';
import { SkillService } from 'src/app/service/skill.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-hardsoftskill',
  templateUrl: './hardsoftskill.component.html',
  styleUrls: ['./hardsoftskill.component.css']
})
export class HardsoftskillComponent implements OnInit {

  skill: Skill[] = [];

  constructor(private skillService: SkillService, private tokenService: TokenService) { }
  isLogged = false;

  ngOnInit(): void {
    this.cargarSkill();
    if(this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarSkill(): void {
    this.skillService.lista().subscribe(data => {
      this.skill = data;
      }
    )
  }

  delete(id?: number) {
    if(id != undefined) {
      this.skillService.delete(id).subscribe(data => {
        this.cargarSkill();
        }, err => {
          alert("no se elimino");
        }
      )
    }
  }


}
