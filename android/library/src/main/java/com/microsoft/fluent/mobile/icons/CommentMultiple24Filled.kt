package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CommentMultiple24: ImageVector
  get() {
    if (_commentMultiple24 != null) {
      return _commentMultiple24!!
    }
    _commentMultiple24 = fluentIcon(name = "Filled.CommentMultiple24", 24f) {
      materialPath {
          moveTo(5.25F, 5.0F)
          curveTo(5.168F, 5.0F, 5.087F, 5.002F, 5.006F, 5.007F)
          curveTo(5.583F, 4.1F, 6.596F, 3.5F, 7.75F, 3.5F)
          horizontalLineToRelative(8.0F)
          curveToRelative(3.176F, 0.0F, 5.75F, 2.574F, 5.75F, 5.75F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 1.153F, -0.601F, 2.167F, -1.507F, 2.743F)
          curveTo(19.998F, 15.913F, 20.0F, 15.832F, 20.0F, 15.75F)
          verticalLineToRelative(-6.5F)
          curveTo(20.0F, 6.903F, 18.097F, 5.0F, 15.75F, 5.0F)
          horizontalLineTo(5.25F)
          close()
          moveTo(2.0F, 9.25F)
          curveTo(2.0F, 7.455F, 3.455F, 6.0F, 5.25F, 6.0F)
          horizontalLineToRelative(10.5F)
          curveTo(17.545F, 6.0F, 19.0F, 7.455F, 19.0F, 9.25F)
          verticalLineToRelative(6.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-5.002F)
          lineTo(6.99F, 21.76F)
          curveTo(6.164F, 22.366F, 5.0F, 21.775F, 5.0F, 20.752F)
          verticalLineToRelative(-1.761F)
          curveToRelative(-1.678F, -0.128F, -3.0F, -1.53F, -3.0F, -3.241F)
          verticalLineToRelative(-6.5F)
          close()        
      }
    }
    return _commentMultiple24!!
  }

private var _commentMultiple24: ImageVector? = null
