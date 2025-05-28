package it.nextre.aut.dto;

public class GroupDTO {

    private Long id;
    private RoleDTO roleDTO;


    public GroupDTO() {
    }

    public GroupDTO(Long id, RoleDTO roleDTO) {
        this.id = id;
        this.roleDTO = roleDTO;
    }

    public static GroupDTOBuilder of() {
        return new GroupDTOBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleDTO getRoleDTO() {
        return roleDTO;
    }

    public void setRoleDTO(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }

    public static class GroupDTOBuilder {

        private Long id;
        private RoleDTO roleDTO;

        private GroupDTOBuilder(){}

        public GroupDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public GroupDTOBuilder roleDTO(RoleDTO roleDTO) {
            this.roleDTO = roleDTO;
            return this;
        }

        public GroupDTO build() {
            return new GroupDTO(id, roleDTO);
        }
    }
}
