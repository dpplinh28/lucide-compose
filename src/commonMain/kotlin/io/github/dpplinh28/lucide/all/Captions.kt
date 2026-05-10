package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Captions") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                horizontalLineToRelative(4f)
                moveTo(15f, 15f)
                horizontalLineToRelative(2f)
                moveTo(7f, 11f)
                horizontalLineToRelative(2f)
                moveTo(13f, 11f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.CaptionsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Captions: ImageVector
    @Composable get() = CaptionsDefinition.asImageVector()
