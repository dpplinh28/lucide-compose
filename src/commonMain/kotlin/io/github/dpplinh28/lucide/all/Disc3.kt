package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Disc3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                curveToRelative(0f, -1.7f, .7f, -3.2f, 1.8f, -4.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                curveToRelative(0f, 1.7f, -.7f, 3.2f, -1.8f, 4.2f)
            }
}

public val LucideIcons.All.Disc3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Disc3: ImageVector
    @Composable get() = Disc3Definition.asImageVector()
