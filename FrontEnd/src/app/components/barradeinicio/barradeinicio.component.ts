import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-barradeinicio',
  templateUrl: './barradeinicio.component.html',
  styleUrls: ['./barradeinicio.component.css']
})
export class BarradeinicioComponent implements OnInit {
  isLogged = false;

  constructor(private router: Router, private tokenService: TokenService) { }

  ngOnInit(): void {
    if(this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  onLogOut(): void {
    this.tokenService.logOut();
    window.location.reload();
    
  }

  login() {
    this.router.navigate(['/login'])
  }

}
