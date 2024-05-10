package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CallEnd12: ImageVector
  get() {
    if (_callEnd12 != null) {
      return _callEnd12!!
    }
    _callEnd12 = fluentIcon(name = "Filled.CallEnd12", 12f) {
      materialPath {
          moveTo(6.0F, 2.999F)
          curveToRelative(-1.292F, 0.0F, -2.568F, 0.26F, -3.503F, 0.742F)
          curveToRelative(-0.911F, 0.47F, -1.67F, 1.261F, -1.462F, 2.34F)
          lineToRelative(0.101F, 0.65F)
          curveTo(1.26F, 7.52F, 1.976F, 8.074F, 2.768F, 7.995F)
          lineToRelative(0.774F, -0.078F)
          curveToRelative(0.68F, -0.068F, 1.227F, -0.587F, 1.332F, -1.262F)
          lineTo(4.957F, 6.12F)
          curveTo(5.164F, 6.064F, 5.512F, 6.0F, 6.0F, 6.0F)
          curveToRelative(0.49F, 0.0F, 0.837F, 0.064F, 1.044F, 0.12F)
          lineToRelative(0.083F, 0.534F)
          curveTo(7.232F, 7.329F, 7.78F, 7.848F, 8.459F, 7.916F)
          lineToRelative(0.774F, 0.077F)
          curveToRelative(0.792F, 0.08F, 1.509F, -0.474F, 1.631F, -1.262F)
          lineToRelative(0.102F, -0.65F)
          curveToRelative(0.208F, -1.079F, -0.551F, -1.87F, -1.462F, -2.34F)
          curveTo(8.57F, 3.258F, 7.292F, 2.999F, 6.0F, 2.999F)
          close()        
      }
    }
    return _callEnd12!!
  }

private var _callEnd12: ImageVector? = null
