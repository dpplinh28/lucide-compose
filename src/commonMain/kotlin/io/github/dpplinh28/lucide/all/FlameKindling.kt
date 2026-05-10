package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlameKindling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                curveToRelative(1f, 3f, 2.5f, 3.5f, 3.5f, 4.5f)
                arcTo(5f, 5f, 0f, false, true, 17f, 10f)
                arcToRelative(5f, 5f, 0f, true, true, -10f, 0f)
                curveToRelative(0f, -.3f, 0f, -.6f, .1f, -.9f)
                arcToRelative(2f, 2f, 0f, true, false, 3.3f, -2f)
                curveTo(8f, 4.5f, 11f, 2f, 12f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 22f)
                lineToRelative(14f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 18f)
                lineToRelative(14f, 4f)
            }
}

public val LucideIcons.All.FlameKindlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlameKindling: ImageVector
    @Composable get() = FlameKindlingDefinition.asImageVector()
