import basic_imports;

uniform sampler2D u_texture;

uniform sampler2D textureLight;

setting vec2 resolution;

varying vec4 v_color;
varying vec2 v_texCoord;

void main() {
    vec4 texColor = texture2D(u_texture, v_texCoord) * v_color;

    vec4 texLightColor = texture2D(textureLight, gl_FragCoord.xy / resolution);
    texColor.rgb = texColor.rgb * texLightColor.rgb;

    gl_FragColor = texColor;
}
