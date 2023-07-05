#include "pets.h"

// Implementação das funções membro da classe Pet

// Construtor
Pet::Pet(){
  nome = especie = raca = cor = motivoVisita = dono = "";
  genero = 'P';
  idade = dia = mes = codigo = altura = peso = 0;
}

// Funções SET

void Pet::setNome(string name){
  if(name.length() > 20){
    throw length_error("O nome excede o limite de 20 caracteres.");
  } else {
    nome = name;
  }
}

void Pet::setEspecie(string species){
  if(species.length() > 20){
    throw length_error("A espécie excede o limite de 20 caracteres.");
  } else {
    especie = species;
  }
}

void Pet::setRaca(string breed){
  raca = breed;
}

void Pet::setCor(string color){
  cor = color;
}

void Pet::setMotivo(string reason){
  if(reason.length() > 40){
    throw length_error("A caixa de texto para documentação do motivo da visita permite 40 caracteres.");
  } else {
    motivoVisita = reason;
  }
}

void Pet::setDono(string owner){
  dono = owner;
}

void Pet::setGenero(char genre){
  genero = genre;
}

void Pet::setIdade(int age){
  if(age <= 0){
    throw invalid_argument("Entre um valor acima de 0 para idade.");
  } else {
    idade = age;
  }
}

void Pet::setDia(int day){
  if(day <= 0 || day > 31){
    throw invalid_argument("Entre um valor de 1 a 31.");
  } else {
    dia = day;
  }
}

void Pet::setMes(int month){
  if(month <= 0 || month > 12){
    throw invalid_argument("Entre um valor de 1 12.");
  } else {
    mes = month;
  }
}

void Pet::setCodigo(int id){
  codigo = id;
}

void Pet::setAltura(float height){
  if(height <= 0){
    throw invalid_argument("Entre um valor válido para altura.");
  } else {
    altura = height;
  }
}

void Pet::setPeso(float weight){
  if(weight <= 0){
    throw invalid_argument("Entre um valor válido para peso.");
  } else {
    peso = weight;
  }
}

// Funções GET

string Pet::getNome(){
  return nome;
}

string Pet::getEspecie(){
  return especie;
}

string Pet::getRaca(){
  return raca;
}

string Pet::getCor(){
  return cor;
}

string Pet::getMotivo(){
  return motivoVisita;
}

string Pet::getDono(){
  return dono;
}

char Pet::getGenero(){
  return genero;
}

int Pet::getIdade(){
  return idade;
}

int Pet::getDia(){
  return dia;
}

int Pet::getMes(){
  return mes;
}

int Pet::getCodigo(){
  return codigo;
}

float Pet::getAltura(){
  return altura;
}

float Pet::getPeso(){
  return peso;
}