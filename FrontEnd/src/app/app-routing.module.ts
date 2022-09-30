import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditexperienciaComponent } from './components/experiencia/editexperiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditSkillComponent } from './components/hardsoftskill/edit-skill.component';
import { NewSkillComponent } from './components/hardsoftskill/new-skill.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos.component';
import { NewProyectosComponent } from './components/proyectos/new-proyectos.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'nuevaexp', component: NewExperienciaComponent},
  {path: 'editexp/:id', component: EditexperienciaComponent},
  {path: 'nuevaedu', component: NeweducacionComponent},
  {path: 'editedu/:id', component: EditeducacionComponent},
  {path: 'newskill', component: NewSkillComponent},
  {path: 'editskill/:id', component: EditSkillComponent},
  {path: 'nuevoproyec', component: NewProyectosComponent},
  {path: 'editproyec/:id', component: EditProyectosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
