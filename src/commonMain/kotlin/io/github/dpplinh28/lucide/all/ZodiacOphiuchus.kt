package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacOphiuchus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                arcTo(6.06f, 6.06f, 0f, false, true, 12f, 10f)
                arcTo(6.06f, 6.06f, 0f, false, false, 21f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(3f)
            }
}

public val LucideIcons.All.ZodiacOphiuchusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacOphiuchus: ImageVector
    @Composable get() = ZodiacOphiuchusDefinition.asImageVector()
