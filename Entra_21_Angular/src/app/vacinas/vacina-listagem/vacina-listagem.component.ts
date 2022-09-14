import { Component, OnInit } from '@angular/core';


export interface Vacina {
  id: number;
  paisOrigem: string;
}

const VACINAS_MOCK: Vacina[] = [
  {id: 1, paisOrigem: 'Brasil'},
  {id: 2, paisOrigem: 'Chile'},
  {id: 3, paisOrigem: 'Argentina'},
  {id: 4, paisOrigem: 'Parguai'},
];



@Component({
  selector: 'app-vacina-listagem',
  templateUrl: './vacina-listagem.component.html',
  styleUrls: ['./vacina-listagem.component.scss']
})



export class VacinaListagemComponent implements  OnInit{
  displayedColumns: string[] = ['id', 'paisOrigem'];
  dataSource = VACINAS_MOCK;

  constructor() { }

  ngOnInit(): void {
  }



}
