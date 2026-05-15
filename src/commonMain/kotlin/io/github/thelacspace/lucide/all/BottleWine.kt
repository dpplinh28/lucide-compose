package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BottleWine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(6f, 6f, 0f, false, false, 1.2f, 3.6f)
                lineToRelative(.6f, .8f)
                arcTo(6f, 6f, 0f, false, true, 17f, 13f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-8f)
                arcToRelative(6f, 6f, 0f, false, true, 1.2f, -3.6f)
                lineToRelative(.6f, -.8f)
                arcTo(6f, 6f, 0f, false, false, 10f, 5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.BottleWineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BottleWine: ImageVector
    @Composable get() = BottleWineDefinition.asImageVector()
