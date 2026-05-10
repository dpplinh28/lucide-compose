package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Zap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 14f)
                arcToRelative(1f, 1f, 0f, false, true, -.78f, -1.63f)
                lineToRelative(9.9f, -10.2f)
                arcToRelative(.5f, .5f, 0f, false, true, .86f, .46f)
                lineToRelative(-1.92f, 6.02f)
                arcTo(1f, 1f, 0f, false, false, 13f, 10f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, .78f, 1.63f)
                lineToRelative(-9.9f, 10.2f)
                arcToRelative(.5f, .5f, 0f, false, true, -.86f, -.46f)
                lineToRelative(1.92f, -6.02f)
                arcTo(1f, 1f, 0f, false, false, 11f, 14f)
                close()
            }
}

public val LucideIcons.All.ZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Zap: ImageVector
    @Composable get() = ZapDefinition.asImageVector()
