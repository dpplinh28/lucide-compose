package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrub") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-5.172f)
                arcToRelative(2f, 2f, 0f, false, false, -.586f, -1.414f)
                lineTo(9.5f, 13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 14.5f)
                lineTo(12f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 8.8f)
                arcTo(6f, 6f, 0f, false, true, 13.8f, 20f)
                horizontalLineTo(10f)
                arcTo(6.5f, 6.5f, 0f, false, true, 7f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                close()
            }
}

public val LucideIcons.All.ShrubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrub: ImageVector
    @Composable get() = ShrubDefinition.asImageVector()
