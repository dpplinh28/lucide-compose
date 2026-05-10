package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pipette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 9f)
                lineToRelative(-8.414f, 8.414f)
                arcTo(2f, 2f, 0f, false, false, 3f, 18.828f)
                verticalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                arcTo(2f, 2f, 0f, false, true, 3.828f, 21f)
                horizontalLineToRelative(1.344f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -.586f)
                lineTo(15f, 12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 9f)
                lineToRelative(.4f, .4f)
                arcToRelative(1f, 1f, 0f, true, true, -3f, 3f)
                lineToRelative(-3.8f, -3.8f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, -3f)
                lineToRelative(.4f, .4f)
                lineToRelative(3.4f, -3.4f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(.414f, -.414f)
            }
}

public val LucideIcons.All.PipetteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pipette: ImageVector
    @Composable get() = PipetteDefinition.asImageVector()
