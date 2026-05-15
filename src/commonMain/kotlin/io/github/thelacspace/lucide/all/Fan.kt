package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.827f, 16.379f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, -8.618f, -7.002f)
                lineToRelative(5.412f, 1.45f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, 7.002f, -8.618f)
                lineToRelative(-1.45f, 5.412f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, 8.618f, 7.002f)
                lineToRelative(-5.412f, -1.45f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, -7.002f, 8.618f)
                lineToRelative(1.45f, -5.412f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(.01f)
            }
}

public val LucideIcons.All.FanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fan: ImageVector
    @Composable get() = FanDefinition.asImageVector()
