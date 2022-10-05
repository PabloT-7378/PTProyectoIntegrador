import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ExperienciaLaboral } from '../modelo/experiencia-laboral';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaServiceService {
  
  URL = 'https://backendpt.herokuapp.com/experiencialaboral/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<ExperienciaLaboral[]> {
    return this.httpClient.get<ExperienciaLaboral[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<ExperienciaLaboral> {
    return this.httpClient.get<ExperienciaLaboral>(this.URL + `detail/${id}`);
  }

  public save(experienciaLaboral: ExperienciaLaboral): Observable<any> {
    return this.httpClient.post<any>(this.URL + 'create', experienciaLaboral);
  }

  public update(id: number, experienciaLaboral: ExperienciaLaboral): Observable<any> {
    return this.httpClient.put<any>(this.URL + `update/${id}`, experienciaLaboral);
  }

  public delete(id:number): Observable<any> {
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}
