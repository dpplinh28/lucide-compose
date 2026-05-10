package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudMoon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 16f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineTo(7f)
                arcToRelative(5f, 5f, 0f, true, true, 4.9f, -6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.376f, 14.512f)
                arcToRelative(6f, 6f, 0f, false, false, 3.461f, -4.127f)
                curveToRelative(.148f, -.625f, -.659f, -.97f, -1.248f, -.714f)
                arcToRelative(4f, 4f, 0f, false, true, -5.259f, -5.26f)
                curveToRelative(.255f, -.589f, -.09f, -1.395f, -.716f, -1.248f)
                arcToRelative(6f, 6f, 0f, false, false, -4.594f, 5.36f)
            }
}

public val LucideIcons.All.CloudMoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudMoon: ImageVector
    @Composable get() = CloudMoonDefinition.asImageVector()
