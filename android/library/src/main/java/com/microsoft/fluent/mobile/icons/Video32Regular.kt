package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Video32: ImageVector
  get() {
    if (_video32 != null) {
      return _video32!!
    }
    _video32 = fluentIcon(name = "Regular.Video32", 32f) {
      materialPath {
          moveTo(6.5F, 6.0F)
          curveTo(4.015F, 6.0F, 2.0F, 8.015F, 2.0F, 10.5F)
          verticalLineToRelative(11.0F)
          curveTo(2.0F, 23.985F, 4.015F, 26.0F, 6.5F, 26.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineToRelative(-0.487F)
          lineToRelative(4.468F, 3.084F)
          curveToRelative(1.492F, 1.03F, 3.528F, -0.037F, 3.528F, -1.851F)
          verticalLineTo(9.754F)
          curveToRelative(0.0F, -1.814F, -2.036F, -2.882F, -3.528F, -1.852F)
          lineTo(22.0F, 10.987F)
          verticalLineTo(10.5F)
          curveTo(22.0F, 8.015F, 19.985F, 6.0F, 17.5F, 6.0F)
          horizontalLineToRelative(-11.0F)
          close()
          moveTo(22.0F, 13.418F)
          lineToRelative(5.604F, -3.87F)
          curveToRelative(0.166F, -0.114F, 0.392F, 0.004F, 0.392F, 0.206F)
          verticalLineToRelative(12.492F)
          curveToRelative(0.0F, 0.201F, -0.226F, 0.32F, -0.392F, 0.206F)
          lineTo(22.0F, 18.582F)
          verticalLineToRelative(-5.165F)
          close()
          moveTo(4.0F, 10.5F)
          curveTo(4.0F, 9.12F, 5.12F, 8.0F, 6.5F, 8.0F)
          horizontalLineToRelative(11.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineToRelative(11.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-11.0F)
          curveTo(5.12F, 24.0F, 4.0F, 22.88F, 4.0F, 21.5F)
          verticalLineToRelative(-11.0F)
          close()        
      }
    }
    return _video32!!
  }

private var _video32: ImageVector? = null
