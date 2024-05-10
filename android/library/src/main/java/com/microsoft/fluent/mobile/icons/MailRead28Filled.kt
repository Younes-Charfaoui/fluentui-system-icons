package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead28: ImageVector
  get() {
    if (_mailRead28 != null) {
      return _mailRead28!!
    }
    _mailRead28 = fluentIcon(name = "Filled.MailRead28", 28f) {
      materialPath {
          moveTo(12.237F, 2.841F)
          curveToRelative(1.103F, -0.588F, 2.427F, -0.588F, 3.53F, 0.0F)
          lineToRelative(8.248F, 4.4F)
          curveToRelative(0.45F, 0.24F, 0.839F, 0.565F, 1.15F, 0.949F)
          lineTo(14.0F, 13.908F)
          lineTo(2.839F, 8.191F)
          curveToRelative(0.31F, -0.384F, 0.699F, -0.71F, 1.15F, -0.95F)
          lineToRelative(8.248F, -4.4F)
          close()
          moveTo(2.147F, 9.522F)
          curveToRelative(-0.094F, 0.33F, -0.143F, 0.675F, -0.143F, 1.028F)
          verticalLineToRelative(8.7F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineTo(22.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineToRelative(-8.7F)
          curveToRelative(0.0F, -0.353F, -0.05F, -0.7F, -0.145F, -1.03F)
          lineTo(14.34F, 15.418F)
          curveToRelative(-0.214F, 0.11F, -0.469F, 0.11F, -0.683F, 0.0F)
          lineTo(2.148F, 9.522F)
          close()        
      }
    }
    return _mailRead28!!
  }

private var _mailRead28: ImageVector? = null
