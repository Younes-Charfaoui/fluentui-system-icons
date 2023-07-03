package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Star28: ImageVector
  get() {
    if (_star28 != null) {
      return _star28!!
    }
    _star28 = fluentIcon(name = "Filled.Star28", 28f) {
      materialPath {
          moveTo(12.701F, 3.908F)
          curveToRelative(0.532F, -1.078F, 2.069F, -1.078F, 2.6F, 0.0F)
          lineToRelative(2.692F, 5.452F)
          lineToRelative(6.017F, 0.875F)
          curveToRelative(1.19F, 0.173F, 1.664F, 1.634F, 0.804F, 2.473F)
          lineToRelative(-4.355F, 4.244F)
          lineToRelative(1.028F, 5.993F)
          curveToRelative(0.204F, 1.185F, -1.04F, 2.088F, -2.103F, 1.529F)
          lineTo(14.0F, 21.644F)
          lineToRelative(-5.381F, 2.83F)
          curveToRelative(-1.064F, 0.559F, -2.307F, -0.344F, -2.104F, -1.529F)
          lineToRelative(1.028F, -5.993F)
          lineToRelative(-4.354F, -4.244F)
          curveToRelative(-0.861F, -0.839F, -0.386F, -2.3F, 0.803F, -2.473F)
          lineTo(10.01F, 9.36F)
          lineToRelative(2.691F, -5.452F)
          close()        
      }
    }
    return _star28!!
  }

private var _star28: ImageVector? = null
