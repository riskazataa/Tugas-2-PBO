class GameCharacter {
        private String Name;
        private int Lifepoint = 100;
        private int Attackhitpoint;
        private int Attackkickpoint;

        public GameCharacter(String Name, int Attackhitpoint, int Attackkickpoint) {
            this.Name = Name;
            this.Attackhitpoint = Attackhitpoint;
            this.Attackkickpoint = Attackkickpoint;
        }

        public String getName() {
            return Name;
        }

        public int getLifepoint() {
            return Lifepoint;
        }

        public void setLifepoint (int Lifepoint) {
            this.Lifepoint = Lifepoint;
        }

        public void kick (GameCharacter character) {
            character.setLifepoint(character.getLifepoint()-this.Attackkickpoint);
        }

        public void hit (GameCharacter character) {
            character.setLifepoint(character.getLifepoint()-this.Attackhitpoint);
        }

        public void compare(GameCharacter character){
            int result = Integer.compare(this.Lifepoint, character.getLifepoint());
            if (result>0) {
                System.out.println(this.Name+" IS WINNER!!!");
            }else if (result<0) {
                System.out.println(character.getName()+" IS WINNER!!!");
            }else{
                System.out.println(" DRAW ");
            }
        }
    }

