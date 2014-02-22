intellij_version = "13.0.2"
intellij_build = "134.1160"

intellij_file = "ideaIC-#{intellij_build}.tar.gz"
intellij_mirror_site = "http://download.jetbrains.com/idea/#{intellij_file}"

directory "/opt" do
  owner "root"
  group "root"
  mode 00777
end

tar_extract intellij_mirror_site do
  target_dir "/opt/"
  creates "/opt/idea-IU-#{intellij_build}"
  user "vagrant"
  not_if { ::File.exists?("/opt/idea")}
end

execute "createsymlink" do
   command "ln -s /opt/idea-IU-#{intellij_build} /opt/idea"
   not_if { ::File.exists?("/opt/idea")}
end
