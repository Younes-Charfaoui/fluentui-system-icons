package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TextEditStyle16: ImageVector
  get() {
    if (_textEditStyle16 != null) {
      return _textEditStyle16!!
    }
    _textEditStyle16 = fluentIcon(name = "Filled.TextEditStyle16", 16f) {
      materialPath {
          moveTo(5.471F, 2.332F)
          curveTo(5.4F, 2.132F, 5.211F, 2.0F, 5.001F, 2.0F)
          curveTo(4.788F, 2.0F, 4.6F, 2.133F, 4.528F, 2.332F)
          lineToRelative(-2.5F, 7.0F)
          curveTo(1.936F, 9.592F, 2.072F, 9.878F, 2.332F, 9.97F)
          curveToRelative(0.26F, 0.093F, 0.546F, -0.043F, 0.639F, -0.303F)
          lineTo(3.924F, 7.0F)
          horizontalLineToRelative(2.152F)
          lineToRelative(0.475F, 1.328F)
          lineToRelative(0.782F, -0.782F)
          lineToRelative(-1.862F, -5.214F)
          close()
          moveToRelative(-0.47F, 1.655F)
          lineTo(5.718F, 6.0F)
          horizontalLineTo(4.281F)
          lineToRelative(0.72F, -2.013F)
          close()
          moveToRelative(5.73F, 1.575F)
          curveToRelative(0.748F, -0.748F, 1.96F, -0.748F, 2.708F, 0.0F)
          curveToRelative(0.748F, 0.748F, 0.748F, 1.96F, 0.0F, 2.707F)
          lineToRelative(-4.657F, 4.657F)
          curveToRelative(-0.35F, 0.349F, -0.794F, 0.587F, -1.278F, 0.683F)
          lineToRelative(-1.906F, 0.382F)
          curveToRelative(-0.164F, 0.032F, -0.333F, -0.019F, -0.452F, -0.137F)
          curveToRelative(-0.118F, -0.118F, -0.17F, -0.288F, -0.136F, -0.452F)
          lineToRelative(0.381F, -1.906F)
          curveToRelative(0.097F, -0.484F, 0.335F, -0.928F, 0.684F, -1.277F)
          lineToRelative(4.657F, -4.657F)
          close()        
      }
    }
    return _textEditStyle16!!
  }

private var _textEditStyle16: ImageVector? = null
