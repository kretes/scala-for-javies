intellij_version = "13.0.2"

intellij_mirror_site = "http://download.jetbrains.com/idea/ideaIU-#{intellij_version}.tar.gz"
intellij_file = "ideaIU-#{intellij_version}.tar.gz"

tar_extract intellij_mirror_site do
  target_dir "/opt/"
  creates "/opt/idea-IU*"
  user "vagrant"
end
