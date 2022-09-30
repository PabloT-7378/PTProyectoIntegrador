import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { BarradeinicioComponent } from './components/barradeinicio/barradeinicio.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercademiComponent } from './components/acercademi/acercademi.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { HardsoftskillComponent } from './components/hardsoftskill/hardsoftskill.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { ReactiveFormsModule } from '@angular/forms';
import { EducacionComponent } from './components/educacion/educacion.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditexperienciaComponent } from './components/experiencia/editexperiencia.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditeducacionComponent } from './components/educacion/editeducacion.component';
import { EditSkillComponent } from './components/hardsoftskill/edit-skill.component';
import { NewSkillComponent } from './components/hardsoftskill/new-skill.component';
import { EditProyectosComponent } from './components/proyectos/edit-proyectos.component';
import { NewProyectosComponent } from './components/proyectos/new-proyectos.component';
import { FooterComponent } from './components/footer/footer.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BarradeinicioComponent,
    BannerComponent,
    AcercademiComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardsoftskillComponent,
    ProyectosComponent,
    HomeComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditexperienciaComponent,
    NeweducacionComponent,
    EditeducacionComponent,
    EditSkillComponent,
    NewSkillComponent,
    EditProyectosComponent,
    NewProyectosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
