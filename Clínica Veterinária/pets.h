#ifndef PETS_H
#define PETS_H
#endif // Impede múltiplas definições do arquivo pets.h

// Definição do arquivo de cabeçalho string
#include <string>
using std::string;
using std::getline;

// Definição do arquivo de cabeçalho exception
#include <stdexcept>
using std::length_error;
using std::invalid_argument;

// Implementação da classe Pet
class Pet{
  public:
    Pet(); // Definiçao de construtor
    // Definição dos métodos SET
    void setNome( string );
    void setEspecie( string );
    void setRaca( string );
    void setCor( string );
    void setMotivo( string );
    void setDono( string );
    void setGenero( char );
    void setIdade( int );
    void setDia( int );
    void setMes( int );
    void setCodigo( int );
    void setAltura( float );
    void setPeso( float );
    // Definição do métodos GET
    string getNome();
    string getEspecie();
    string getRaca();
    string getCor();
    string getMotivo();
    string getDono();
    char getGenero();
    int getIdade();
    int getDia();
    int getMes();
    int getCodigo();
    float getAltura();
    float getPeso();
  private:
    string nome, especie, raca, cor, motivoVisita, dono;
    char genero;
    int idade, dia, mes, codigo;
    float altura, peso;
};