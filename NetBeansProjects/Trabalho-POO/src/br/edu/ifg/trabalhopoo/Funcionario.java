package br.edu.ifg.trabalhopoo;

import java.util.Objects;

/**
 *
 * @author gustavo
 */
public class Funcionario extends Pessoa {
    
    private Setor setor;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        return true;
    } 
}
